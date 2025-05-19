package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger;

import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.abstract_handler.Logger;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.concrete_handlers.DebugLogger;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.concrete_handlers.ErrorLogger;
import com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.logger.concrete_handlers.InfoLogger;

public class LoggingClient
{
    private static final int DEBUG = 1;
    private static final int INFO = 2;
    private static final int ERROR = 3;

    public static void run()
    {
        System.out.println("LoggingClient.run():");
        Logger debugLogger = new DebugLogger(DEBUG);
        Logger infoLogger = new InfoLogger(INFO);
        Logger errorLogger = new ErrorLogger(ERROR);

        // Build the chain: DEBUG -> INFO -> ERROR
        debugLogger.setNext(infoLogger);
        infoLogger.setNext(errorLogger);

        debugLogger.log(DEBUG, "1message");
        debugLogger.log(INFO, "2message");
        debugLogger.log(ERROR, "3message");

        System.out.println("------------------");

        infoLogger.log(DEBUG, "1.message");//not prints b'coz level passed(DEBUG) is below infoLogger object level.
        infoLogger.log(INFO, "2.message");
        infoLogger.log(ERROR, "3.message");

        System.out.println("+++------------------");

        errorLogger.log(DEBUG, "11message");//not prints b'coz level passed(DEBUG) is below errorLogger object level.
        errorLogger.log(INFO, "22message");//not prints b'coz level passed(INFO) is below errorLogger object level.
        errorLogger.log(ERROR, "33message");

    }
}
