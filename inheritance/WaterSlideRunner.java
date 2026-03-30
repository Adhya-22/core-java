class WaterSlideRunner
{
    public static void main(String[] args)
	{
        WaterSlide waterSlide1=new WaterSlide();
        waterSlide1.material="Fiber";
        waterSlide1.height=20;
        waterSlide1.indoor=false;
        waterSlide1.length=50;
        waterSlide1.waterFlow=true;
        waterSlide1.parkName="Wonderla";
        waterSlide1.capacity=10;
        waterSlide1.safetyGuard=true;
        waterSlide1.climb();
        waterSlide1.slide();
        waterSlide1.ride();

        WaterSlide waterSlide2=new WaterSlide();
        waterSlide2.material="Plastic";
        waterSlide2.height=15;
        waterSlide2.indoor=true;
        waterSlide2.length=40;
        waterSlide2.waterFlow=true;
        waterSlide2.parkName="FunWorld";
        waterSlide2.capacity=8;
        waterSlide2.safetyGuard=false;
        waterSlide2.climb();
        waterSlide2.slide();
        waterSlide2.ride();

        Slide slide1=new WaterSlide();
        slide1.material="Steel";
        slide1.height=18;
        slide1.indoor=false;
        slide1.climb();
        slide1.slide();

        Slide slide2=new WaterSlide();
        slide2.material="Wood";
        slide2.height=10;
        slide2.indoor=true;
        slide2.climb();
        slide2.slide();

        Slide slide3=new Slide();
        slide3.material="Plastic";
        slide3.height=12;
        slide3.indoor=true;
        slide3.climb();
        slide3.slide();

        Slide slide4=new Slide();
        slide4.material="Metal";
        slide4.height=25;
        slide4.indoor=false;
        slide4.climb();
        slide4.slide();
    }
}