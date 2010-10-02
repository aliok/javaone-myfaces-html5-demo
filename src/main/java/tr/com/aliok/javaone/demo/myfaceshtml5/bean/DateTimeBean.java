package tr.com.aliok.javaone.demo.myfaceshtml5.bean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "dateTimeBean")
@ViewScoped
public class DateTimeBean implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Date date01;
    private Date date02;
    private Date date03;
    private Date date04;
    private Date date05;
    private Date date06;

    public Date getDate01()
    {
        return date01;
    }

    public void setDate01(Date date01)
    {
        this.date01 = date01;
    }

    public Date getDate02()
    {
        return date02;
    }

    public void setDate02(Date date02)
    {
        this.date02 = date02;
    }

    public Date getDate03()
    {
        return date03;
    }

    public void setDate03(Date date03)
    {
        this.date03 = date03;
    }

    public Date getDate04()
    {
        return date04;
    }

    public void setDate04(Date date04)
    {
        this.date04 = date04;
    }

    public Date getDate05()
    {
        return date05;
    }

    public void setDate05(Date date05)
    {
        this.date05 = date05;
    }

    public Date getDate06()
    {
        return date06;
    }

    public void setDate06(Date date06)
    {
        this.date06 = date06;
    }

}
