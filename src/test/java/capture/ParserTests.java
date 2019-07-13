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

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParserTests
{
    private Parser _unitUnderTest;

    @Before
    public void Setup()
    {
        _unitUnderTest = new Parser();
    }

    @Test
    public void SplitsInputCorrectly3()
    {
        try
        {
            String [] result = _unitUnderTest.parseInput("1 + 1");
            Assert.assertEquals("Wrong number of extracted elements", 3, result.length);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected " + ex.getClass().getName() + " thrown: " + ex.getLocalizedMessage());
        }
    }

    @Test
    public void SplitsInputCorrectly1()
    {
        try
        {
            String [] result = _unitUnderTest.parseInput("1+1");
            Assert.assertEquals("Wrong number of extracted elements", 1, result.length);
        }
        catch (Exception ex)
        {
            Assert.fail("Unexpected " + ex.getClass().getName() + " thrown: " + ex.getLocalizedMessage());
        }
    }

}
