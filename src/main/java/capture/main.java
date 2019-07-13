/*
 * *****************************************************************************
 *
 * Copyright 2019: Refinitiv. All Rights Reserved.
 * This document contains information proprietary to Refinitiv
 * and may not be reproduced and/or used in whole or part without the express
 * written permission of Refinitiv.
 *
 * *****************************************************************************
 */
package capture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main
{
    public static void main(String[] args)
    {
        try
        {
            Boolean finished = false;
            Parser parser = new Parser();

            while (!finished)
            {
                System.out.println("Enter Calculation:");
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                if ("quit".equals(input))
                {
                    finished = true;
                }
                else
                {
                    System.out.println("Input was :'" + input + "'");
                    String[] calculation = parser.parseInput(input);
                    for (int i = 0; i < calculation.length; i++)
                    {
                        System.out.println("Parsed input[" + i + "] is :'" + calculation[i] + "'");
                    }

                }
            }
            System.out.println("----------- Finished -----------'");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
