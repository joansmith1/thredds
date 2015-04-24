// $Id: TestDatasetNamerType.java 61 2006-07-12 21:36:00Z edavis $

/*
 * Copyright 1998-2009 University Corporation for Atmospheric Research/Unidata
 *
 * Portions of this software were developed by the Unidata Program at the
 * University Corporation for Atmospheric Research.
 *
 * Access and use of this software shall impose the following obligations
 * and understandings on the user. The user is granted the right, without
 * any fee or cost, to use, copy, modify, alter, enhance and distribute
 * this software, and any derivative works thereof, and its supporting
 * documentation for any purpose whatsoever, provided that this entire
 * notice appears in all copies of the software, derivative works and
 * supporting documentation.  Further, UCAR requests that the user credit
 * UCAR/Unidata in any publications that result from the use of this
 * software or in any product that includes this software. The names UCAR
 * and/or Unidata, however, may not be used in any advertising or publicity
 * to endorse or promote any products or commercial entity unless specific
 * written permission is obtained from UCAR/Unidata. The user also
 * understands that UCAR/Unidata is not obligated to provide the user with
 * any support, consulting, training or assistance of any kind with regard
 * to the use, operation and performance of this software nor to provide
 * the user with any updates, revisions, new versions or "bug fixes."
 *
 * THIS SOFTWARE IS PROVIDED BY UCAR/UNIDATA "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL UCAR/UNIDATA BE LIABLE FOR ANY SPECIAL,
 * INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING
 * FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
 * NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION
 * WITH THE ACCESS, USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package thredds.cataloggen.config;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 */
public class TestDatasetNamerType
{
  static private org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TestDatasetNamerType.class);

  private String typeName1;
  private String typeName2;

  @Before
  public void setUp()
  {
    typeName1 = "RegExp"; // REGULAR_EXPRESSION
    typeName2 = "DodsAttrib"; // DODS_ATTRIBUTE
  }

  @Test
  public void testDatasetNamerType()
  {
    assertTrue( DatasetNamerType.REGULAR_EXPRESSION.toString().equals( typeName1));
    assertTrue( DatasetNamerType.REGULAR_EXPRESSION.equals( DatasetNamerType.getType( typeName1)));

    assertTrue( DatasetNamerType.DODS_ATTRIBUTE.toString().equals( typeName2));
    assertTrue( DatasetNamerType.DODS_ATTRIBUTE.equals( DatasetNamerType.getType( typeName2)));
  }

}