package tr.com.aliok.javaone.demo.myfaceshtml5.model;



public enum SportsTeamType
{

    FOOTBALL("F"), BASKETBALL("B");

    private final String code;

    private SportsTeamType(String code)
    {
        this.code = code;
    }

    @Override
    public String toString()
    {
        return code;
    }

    public String getCode()
    {
        return code;
    }

}