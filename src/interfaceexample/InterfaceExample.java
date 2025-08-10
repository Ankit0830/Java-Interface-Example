package interfaceexample;

class Phone
{
    public void Call() {System.out.println("Phone call : "); } 
    public void Sms() {System.out.println("Sending and Reciving SMS : "); }
}

interface ICamera
{
    void Click();
    void Record();
    void CStop();
}

interface MusicPlayer
{
    void Play();
    void Stop();
}

class SmartPhone extends Phone implements ICamera, MusicPlayer
{
    public void VideoCall(){
        System.out.println("Smart Phone given VideoCall Functionlity :");
    }
    public void Click(){
        System.out.println("SmartPhone given Clicking Photos : ");
    }
    public void Record(){
        System.out.println("SmartPhone given Video Recording : ");
    }
    @Override
    public void CStop(){
        System.out.println("SmartPhone given Function Can Stop Recording : ");
    }
    public void Play(){
        System.out.println("SmartPhone given Music Player Function : ");
    }
    public void Stop(){
        System.out.println("SmartPhone given Music Stop Function : ");
    }
}
    

public class InterfaceExample 
{

    public static void main(String[] args) 
    {
        SmartPhone s = new SmartPhone();
        s.Call();
        s.Sms();
        s.Click();
        s.Record();
        s.CStop();
        s.Play();
        s.Stop();
    }
    
}
