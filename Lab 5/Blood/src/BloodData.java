/**
 * Created by Gabriel Rosales on 2/27/17.
 */
package Blood;
public class BloodData
{
    private String bloodType;
    private char rh;
    public BloodData()
    {
        bloodType = "O";
        rh = '+';
    }
    public BloodData(String type, char factor)
    {
        bloodType = type;
        rh = factor;
    }
    public void setBloodType(String type)
    {
        this.bloodType = type;
    }
    public void setRhFactor(char factor)
    {
        this.rh= factor;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public char getRhFactor()
    {
        return rh;
    }
}