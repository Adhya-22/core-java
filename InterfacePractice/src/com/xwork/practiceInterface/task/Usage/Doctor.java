package com.xwork.practiceInterface.task.Usage;

import com.xwork.practiceInterface.task.Hospital;

public class Doctor
{
    Hospital hospital;

    public Doctor(Hospital hospital)
    {
        this.hospital=hospital;
    }

    public void Prescribe()
    {
        System.out.println("prescribing medicine");
        if(this.hospital!=null)
        {
            this.hospital.treatment();
        }
    }

}
