public class Lampada
{
    private boolean isOn;
    private boolean isBroken;
    public void lightSwitch()
    {
        if (isBroken)
        {
            System.out.println("Não é possível realizar a ação!");
        }
        else
        {
            int chance = calcBroken();
            if (!isOn && chance > 30)
            {
                isOn = true;
                System.out.println("A lãmpada foi ligada!");
            }
            else if(!isOn && chance <= 30)
            {   
                isBroken = true;
                System.out.println("A lâmpada QUEIMOU!");
            }
            else
            {
                isOn = false;
                System.out.println("A lâmpada foi desligada!");
            }
        }
    }
    public void lightStatus()
    {
        if (isBroken)
            System.out.println("A lâmpada está QUEIMADA!");
        else if (!isOn)
            System.out.println("A lãmpada está desligada!");
        else
            System.out.println("A lãmpada está ligada!");
    }
    public static int calcBroken()
    {
        int result = (int) (Math.random() * 100);
        return result;
    }
}