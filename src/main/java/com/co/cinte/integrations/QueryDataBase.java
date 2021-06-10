package com.co.cinte.integrations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.co.cinte.exceptions.SqlExceptions;
import com.co.cinte.models.DataBase;
import com.co.cinte.models.Events;
import com.co.cinte.utils.ConexionDataBase;
import com.co.cinte.utils.maps.MapDataBase;
import com.co.cinte.utils.messages.MessagesDB;

public class QueryDataBase {
	private static ConexionDataBase conexionDB = new ConexionDataBase();
	private static final Logger LOGGER = LoggerFactory.getLogger(QueryDataBase.class);
	static MapDataBase map = new MapDataBase();
	static DataBase cx = map.init();
	static Connection con;
	public static final String RESULT_IS_NOT_EMPTY = "Result is no empty for query: ";
	public static final String RESULT_IS_EMPTY = "Result is empty for query: ";

	public static final String DATE = "fecha";
	public static final String PLANT = "planta";
	public static final String NAME_UNIT = "nombreUnidad";
	public static final String AGENT = "agente";
	public static final String AGC = "AGC";
	public static final String TEST = "pruebas";
	public static final String R_PLANT = "registroPlantaID";
	public static final String R_EMAIL = "correoRegistro";
	public static final String CHECK_RPF = "cumpleRPF";
	public static final String EMAIL_RPF = "correoRPF";
	public static final String OBSERVATION = "observacion";

	public static void conexion() throws ClassNotFoundException {

		con = conexionDB.conectar(cx.getHost(), cx.getUser(), cx.getPassword());

	}

	public void updatePosition(String strQuery, int position, String valueQuery)
			throws SQLException, ClassNotFoundException {
		conexion();

		try (PreparedStatement ps = con.prepareStatement(strQuery, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY)) {
			ps.setString(position, valueQuery);
			ps.executeQuery();
			con.close();
		} catch (SQLException e) {
			throw new SqlExceptions(SqlExceptions.ERROR_EXECUTE_QUERY, e);
		} finally {
			con.close();
		}
	}

	public static void executeUpdateQuery(String strQuery) throws SQLException, ClassNotFoundException {
		conexion();

		try (PreparedStatement ps = con.prepareStatement(strQuery)) {
			ps.executeUpdate();
			LOGGER.info(MessagesDB.EXECUTION_QUERY.getDatabase(), strQuery);
		} catch (SQLException e) {
			throw new SqlExceptions(SqlExceptions.ERROR_EXECUTE_QUERY, e);
		} finally {
			con.close();
		}
	}

	public static void executeQuery(String strQuery) throws SQLException, ClassNotFoundException {
		conexion();

		try (PreparedStatement ps = con.prepareStatement(strQuery)) {
			ps.executeQuery();
			LOGGER.info(MessagesDB.EXECUTION_QUERY.getDatabase(), strQuery);
		} catch (SQLException e) {
			throw new SqlExceptions(SqlExceptions.ERROR_EXECUTE_QUERY, e);
		} finally {
			con.close();
		}
	}

	public static String getStringValue(String strQuery, String field) throws SQLException, ClassNotFoundException {
		conexion();
		String value = "0";
		try (PreparedStatement ps = con.prepareStatement(strQuery, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY)) {
			try (ResultSet rs = ps.executeQuery()) {
				if (!rs.next()) {
					LOGGER.info(RESULT_IS_EMPTY, strQuery);
				} else {
					rs.first();
					value = rs.getString(field);
					LOGGER.info(RESULT_IS_NOT_EMPTY, strQuery);
				}
			}
		} catch (SQLException e) {
			throw new SqlExceptions(SqlExceptions.ERROR_EXECUTE_QUERY, e);
		}
		return value;

	}

	public static Events getCustomerById(String strQuery, String nameplant)
			throws ClassNotFoundException, SQLException {
		conexion();
		Events events = new Events();

		try (PreparedStatement ps = con.prepareStatement(strQuery, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY)) {
			ps.setString(1, nameplant);

			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {

					events.setDate(rs.getString(DATE));
					events.setPlant(rs.getString(PLANT));
					events.setNameUnit(rs.getString(NAME_UNIT));
					events.setAgent(rs.getString(AGENT));
					events.setAgc(rs.getString(AGC));
					events.setTest(rs.getString(TEST));
					events.setRegisterPlant(rs.getString(R_PLANT));
					events.setRegisterEmail(rs.getString(R_EMAIL));
					events.setCheckRPF(rs.getString(CHECK_RPF));
					events.setEmailRpf(rs.getString(EMAIL_RPF));
					events.setObservation(rs.getString(OBSERVATION));

				}

			}
		} catch (SQLException e) {

			throw new SqlExceptions(SqlExceptions.ERROR_EXECUTE_QUERY, e);
		} finally {

			con.close();
		}

		return events;
	}

}
