class MissleRunner
{
    public static void main(String[] args)
	{
        Missle m1 = new Missle();
        m1.launch();
        m1.igniteEngine();
        m1.trackTarget();
        m1.lockTarget();
        m1.increaseSpeed();
        m1.decreaseSpeed();
        m1.changeDirection();
        m1.activateGuidanceSystem();
        m1.deployWarhead();
        m1.selfDestruct();
        m1.checkFuelLevel();
        m1.stabilizeFlight();
        m1.detectObstacle();
        m1.sendSignal();
        m1.landSafely();

        Missle m2 = new Missle();
        m2.launch();
        m2.igniteEngine();
        m2.trackTarget();
        m2.lockTarget();
        m2.increaseSpeed();
        m2.decreaseSpeed();
        m2.changeDirection();
        m2.activateGuidanceSystem();
        m2.deployWarhead();
        m2.selfDestruct();
        m2.checkFuelLevel();
        m2.stabilizeFlight();
        m2.detectObstacle();
        m2.sendSignal();
        m2.landSafely();

        
        Missle.missileType();
        Missle.manufacturer();
        Missle.maximumRange();
        Missle.safetyProtocol();
        Missle.purpose();
    }
}