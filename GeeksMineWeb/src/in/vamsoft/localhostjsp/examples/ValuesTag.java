package in.vamsoft.localhostjsp.examples;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class ValuesTag extends TagSupport{
  private Object objectValue="-1";
  private String stringValue="-1";
  private long longValue=-1;
  private double doubleValue=-1;
  public void setObjectValue(Object objectValue) {
    this.objectValue = objectValue;
  }
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }
  public void setLongValue(long longValue) {
    this.longValue = longValue;
  }
  public void setDoubleValue(double doubleValue) {
    this.doubleValue = doubleValue;
  }
  public int doEndTag() {
    JspWriter out = pageContext.getOut();
    try {
      if (!"-1".equals(objectValue)) {
          out.print(objectValue);
      } else if (!"-1".equals(stringValue)) {
          out.print(stringValue);
      } else if (longValue != -1) {
          out.print(longValue);
      } else if (doubleValue != -1) {
          out.print(doubleValue);
      } else {
          out.print("-1");
      }
  } catch (IOException ex) {
      try {
        throw new JspTagException("IOException: " + ex.toString(), ex);
      } catch (JspTagException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
  }
  try {
    return super.doEndTag();
  } catch (JspException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
  }
  return 0;
}
}
