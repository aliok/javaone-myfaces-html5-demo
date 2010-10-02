package tr.com.aliok.javaone.demo.myfaceshtml5.model;

import java.io.Serializable;

public class SportsTeam implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private SportsTeamType type;

    public SportsTeam(String id, String name, SportsTeamType type)
    {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public SportsTeamType getType()
    {
        return type;
    }

    public void setType(SportsTeamType type)
    {
        this.type = type;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof SportsTeam)
        {
            SportsTeam other = (SportsTeam) obj;
            if(other.getId().equals(this.id))
                return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode()
    {
        return this.id.hashCode();
    }

}
