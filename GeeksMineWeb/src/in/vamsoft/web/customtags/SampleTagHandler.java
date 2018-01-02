package in.vamsoft.web.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SampleTagHandler extends SimpleTagSupport{
  public void doTag() {
    JspWriter out=getJspContext().getOut();
    try {
      out.println("My first custom tag");
    } catch (IOException e) {
      
      e.printStackTrace();
    }
  }
  
  
  
  
  
  
  
  
  


}
