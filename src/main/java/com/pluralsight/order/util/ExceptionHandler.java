package com.pluralsight.order.util;

import java.sql.SQLException;
import java.text.MessageFormat;

/**
 * Utility class to handle exceptions
 */
public class ExceptionHandler {

    /**
     * Method to extract and print information from a SQLException
     * @param sqlException Exception from which information will be extracted
     */
    public static void handleException(SQLException sqlException) {
        String exception = MessageFormat.format("Error code : {0},  SQL State : {1}, Message : {2}.", sqlException.getErrorCode(), sqlException.getSQLState(), sqlException.getMessage());
        System.out.println(exception);
        sqlException.printStackTrace();
    }
}
