class BrainRunner
{
	public static void main(String[] args)
	{
		Brain brain1 = new Brain("Cerebrum","Thinking",1.4,"Left","Frontal","Pinkish","86 Billion",
        "High","Complex","Adult","None","Skull","Short-term","Voluntary","Electrical","High",
        "Fast","Forebrain","Healthy","Dopamine");
		brain1.getInfo();

		Brain brain2 = new Brain("Cerebellum","Balance",0.15,"Both","Occipital","Light Pink","69 Billion",
        "Moderate","Compact","Adult","None","Skull","Motor Memory","Automatic","Electrical","Medium",
        "Quick","Hindbrain","Healthy","GABA");
		brain2.getInfo();

		Brain brain3 = new Brain("Medulla","Breathing",0.05,"Center","Brainstem","Pink","5 Billion",
        "High","Basic","Adult","Stroke","Skull","None","Reflex","Electrical","Low","Very Fast",
		"Brainstem","Sensitive","Serotonin");
		brain3.getInfo();

		Brain brain4 = new Brain("Frontal Lobe","Decision Making",0.5,"Left","Frontal","Pink","20 Billion",
        "High","Layered","Adult","Injury","Skull","Working Memory","Voluntary","Neural","High",
        "Fast","Forebrain","Healthy","Dopamine");
		brain4.getInfo();

		Brain brain5 = new Brain("Temporal Lobe","Hearing",0.4,"Right","Temporal","Pink","15 Billion",
        "Moderate","Layered","Adult","Epilepsy","Skull","Auditory","Automatic","Neural","Medium",
        "Quick","Forebrain","Stable","Acetylcholine");
		brain5.getInfo();

		Brain brain6 = new Brain("Parietal Lobe","Sensation",0.45,"Left","Parietal","Pink","18 Billion",
        "Moderate","Complex","Adult","None","Skull","Sensory","Reflex","Neural","Medium","Quick",
		"Forebrain","Healthy","Glutamate");
		brain6.getInfo();

		Brain brain7 = new Brain("Occipital Lobe","Vision",0.3,"Right","Occipital","Pink","12 Billion",
        "Moderate","Layered","Adult","None","Skull","Visual","Automatic","Neural","Medium","Fast",
		"Forebrain","Healthy","Serotonin");
		brain7.getInfo();

		Brain brain8 = new Brain("Brainstem","Vital Control",0.1,"Center","Stem","Light Pink","3 Billion",
        "High","Basic","Adult","Injury","Skull","None","Reflex","Electrical","Low","Very Fast",
		"Hindbrain","Critical","GABA");
		brain8.getInfo();

		Brain brain9 = new Brain("Hypothalamus","Hormone Control",0.08,"Center","Limbic","Pink","2 Billion",
        "High","Compact","Adult","Hormonal Disorder","Skull","Regulatory","Automatic","Chemical",
		"Medium","Quick","Midbrain","Sensitive","Oxytocin");
		brain9.getInfo();

		Brain brain10 = new Brain("Amygdala","Emotion",0.07,"Both","Limbic","Pink","2 Billion",
        "Moderate","Compact","Adult","Anxiety","Skull","Emotional","Automatic","Chemical","Medium",
        "Quick","Midbrain","Active","Serotonin");
		brain10.getInfo();
	}
}