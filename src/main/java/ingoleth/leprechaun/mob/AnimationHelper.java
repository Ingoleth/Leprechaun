package ingoleth.leprechaun.mob;

import net.minecraft.util.math.MathHelper;

public class AnimationHelper {

	private int timer;
	private int prevTimer;
	private int duration;
	
	public AnimationHelper (int d) {
        prevTimer = 0;
		timer = 0;
		duration = d;
			
	}

	public void setDuration(int duration) {
		timer = 0;
		prevTimer = 0;
		this.duration = 0;
	}
	
	public void setTimer(int time) {//C
        timer = time;

        if (timer > duration) {
            timer = duration;
        } else if (timer < 0) {
            timer = 0;
        }
    }
	
	 public void increaseTimer() {//C
	        if (timer < duration) {
	            timer++;
	        }
	    }
	 
	 public void updateTimer() {
	        prevTimer = timer;
	    }
	 
	 public void increaseTimer(int time) {//C
	        int newTime = timer + time;
	        if (newTime <= duration && newTime >= 0) {
	            timer = newTime;
	        } else {
	            timer = newTime < 0 ? 0 : duration;
	        }
	    }
	 
	 public void decreaseTimer() {
	        if (timer > 0) {
	            timer--;
	        }
	    }
	 
	 public void decreaseTimer(int time) {
	        if (timer - time > 0) {
	            timer -= time;
	        } else {
	            timer = 0;
	        }
	    }
	 
	 public int getTimer() {
		 return timer;
	 }
	 
	 public float getAnimationFraction(float partialRenderTicks) {
	        return (prevTimer + (timer - prevTimer) * partialRenderTicks) / duration;
	    }

	 public float getAnimationProgressSin(float partialRenderTicks) {
	        return MathHelper.sin(1.57079632679F * getAnimationFraction(partialRenderTicks));
	    }
	 
	 

	 
}
