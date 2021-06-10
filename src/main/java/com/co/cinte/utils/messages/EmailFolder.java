package com.co.cinte.utils.messages;

public enum EmailFolder {
    INBOX("INBOX"),
    SPAM("SPAM");

    private String text;

    private EmailFolder(String text){
      this.text = text;
    }

    public String getText() {
      return text;
    }
  }