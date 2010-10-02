package tr.com.aliok.javaone.demo.myfaceshtml5.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "clientSideValidationBean")
@ViewScoped
public class ClientSideValidationBean implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String param01;
    private String param02;
    private String param03;
    private String param04;
    private String param05;
    private String param06;

    private String color01;

    private String email01;

    private Number number01;
    private Number number02;

    public String getColor01()
    {
        return color01;
    }

    public void setColor01(String color01)
    {
        this.color01 = color01;
    }

    public String getParam01()
    {
        return param01;
    }

    public void setParam01(String param01)
    {
        this.param01 = param01;
    }

    public String getParam02()
    {
        return param02;
    }

    public void setParam02(String param02)
    {
        this.param02 = param02;
    }

    public String getParam03()
    {
        return param03;
    }

    public void setParam03(String param03)
    {
        this.param03 = param03;
    }

    public String getParam04()
    {
        return param04;
    }

    public void setParam04(String param04)
    {
        this.param04 = param04;
    }

    public String getParam05()
    {
        return param05;
    }

    public void setParam05(String param05)
    {
        this.param05 = param05;
    }

    public String getParam06()
    {
        return param06;
    }

    public void setParam06(String param06)
    {
        this.param06 = param06;
    }

    public String getEmail01()
    {
        return email01;
    }

    public void setEmail01(String email01)
    {
        this.email01 = email01;
    }

    public Number getNumber01()
    {
        return number01;
    }

    public void setNumber01(Number number01)
    {
        this.number01 = number01;
    }

    public Number getNumber02()
    {
        return number02;
    }

    public void setNumber02(Number number02)
    {
        this.number02 = number02;
    }

}
