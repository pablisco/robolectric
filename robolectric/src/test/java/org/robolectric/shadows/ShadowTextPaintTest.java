package org.robolectric.shadows;

import android.text.TextPaint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.TestRunners;

import static junit.framework.Assert.assertEquals;

@RunWith(TestRunners.MultiApiWithDefaults.class)
public class ShadowTextPaintTest {

  @Test
  public void measureText_returnsStringLengthAsMeasurement() throws Exception {
    TextPaint paint = new TextPaint();
    assertEquals(4f, paint.measureText("1234"));
  }
}
