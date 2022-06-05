import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shooters extends Actor
{
    int HP;
    int[] bullet_angles;
    
    // timing variables
    int bullet_counter = 0;
    int spin_counter = 0;
    
    public Shooters(int HP){
        this.HP = HP;
        // INSERT: bullet_angles = bullet_direction(parameters...);
    }
    
    public void moveEnemy()
    {
        setLocation(getX(),getY()+2);
    }
    
    public void shoot(int bullet_speed, int bullets_per_second, int spin_rate, int spin_shift, String image){
        // DESCRIPTION
        // Method for shooting bullets. For working properly "bullet_direction()" methods must be run
        // on the constructor.
        // PARAMETERS:
        // bullet_speed:        how fast each bullet should fly.
        // bullets_per_second:  Amount of bullets that should be fire per second.
        // spin_rate:           How fast the object will spin. Set 0 to NO spin.
        // spin_shift:          Angle the object will shift for each spin. Set 0 to NO shift.
        
        int fireRate = 60 / bullets_per_second;
        this.bullet_counter++;
        this.spin_counter ++;
        
        // Checking if its time to shoot.
        if (this.bullet_counter > fireRate){
            // Restarting counter.
            this.bullet_counter = 0;
            // instantiating bullets.
            for(int angle : this.bullet_angles){
                getWorld().addObject(new enemyBullet(angle, bullet_speed, image), getX(), getY()); 
            }
        }
        // Checking if its time shift angles.
        if (this.spin_counter > spin_rate){
            // Restarting counter.
            this.spin_counter = 0;
            for(int index=0 ; index < this.bullet_angles.length; index++){
                int temp_angle = this.bullet_angles[index] += spin_shift;
                this.bullet_angles[index] += spin_shift;
            }
        }
    }

    public int[] bullet_directions(
        int starting_angle, 
        int angle_between_arrays, 
        int num_arrays, 
        int array_angle, 
        int bullets_per_array, 
        int angle_between_bullet){
        // DESCRIPTION
        // Each time the object fires, it looks for an array of angles, in which it has to shoot.
        // Ex: [0, 45, 90]
        //      In this case each shot will fire 3 bullets at 0, 45 and 90 degrees.
        // This method is responsable of creating this array.
        // PARAMETERS:
        // Visit this simultor, it is more intuitive.
        // https://reiwukleiwu.github.io/Bullet-Hell-Pattern-Generator/
        
        int[] angles = new int[num_arrays * bullets_per_array];
        try{
            angle_between_bullet = array_angle/(bullets_per_array - 1);
        }
        catch(Exception e){
            angle_between_bullet = 0;
        }
        
        int angle_index = 0;
        for(int array=0; array<num_arrays; array++){
            for(int i=0; i<bullets_per_array; i++){
                int temp_angle = starting_angle + angle_between_bullet * i;
                angles[angle_index] = temp_angle;
                angle_index++;
            }
            starting_angle += angle_between_arrays;
        }
        return angles;
    }
    public void rotate(int angle){
        setRotation(angle);
    }
}