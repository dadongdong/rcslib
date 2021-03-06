/* 
The NIST RCS (Real-time Control Systems) 
 library is public domain software, however it is preferred
 that the following disclaimers be attached.

Software Copywrite/Warranty Disclaimer

   This software was developed at the National Institute of Standards and
Technology by employees of the Federal Government in the course of their
official duties. Pursuant to title 17 Section 105 of the United States
Code this software is not subject to copyright protection and is in the
public domain. NIST Real-Time Control System software is an experimental
system. NIST assumes no responsibility whatsoever for its use by other
parties, and makes no guarantees, expressed or implied, about its
quality, reliability, or any other characteristic. We would appreciate
acknowledgement if the software is used. This software can be
redistributed and/or modified freely provided that any derivative works
bear some notice that they are derived from it, and any modified
versions bear some notice that they have been modified.



*/ 



// Set Package Name
package rcs.posemath;

// Import all NML, CMS, and RCS classes and interfaces
import rcs.nml.NMLFormatConverter;


public class PM_POSE  extends PmPose
{
  public void update(NMLFormatConverter nml_fc)
  {
    super.update(nml_fc);
  }

  public PM_POSE()
  {
  }

  public PM_POSE(PmCartesian starttran, PmQuaternion startrot)
  {
    super(starttran,startrot);
  }

  public PM_POSE(PmPose pose) {
      super(pose.tran,pose.rot);
  }
  
  public PM_POSE(PmCartesian starttran, PmRpy startrpy) throws PmException
  {
    super(starttran,startrpy);
  }


  public PM_POSE(
                     double tranx, double trany, double tranz,
                     double rots, double rotx, double roty, double rotz) throws PmException
  {
    super(tranx, trany, tranz,
          rots, rotx, roty, rotz);
  }

  public PM_POSE(PM_XYA xya) throws PmException {
      tran.x = xya.x;
      tran.y = xya.y;
      tran.z = 0;
      PmRpy rpy = new PmRpy();
      rpy.y = xya.a;
      Posemath.pmRpyQuatConvert(rpy,rot);
  }

    @Override
  public PM_POSE clone() {
        PM_POSE cloned_object = null;
        try {
        cloned_object = (PM_POSE) super.clone();
        }  catch (Exception e) {
            e.printStackTrace();
        }
        return cloned_object;
    }

    public PM_POSE(PmHomogeneous h) throws PmException {
        super(h);
    }

    public PM_POSE(double dd[][]) throws PmException {
        super(dd);
    }

}
