// An example of studying the motion of a particle in
// one dimension under an elastic force.
import java.lang.*;
public class Motion {
    static final int n = 100000, j = 500;
    public static void main(String argv[]) {
    double x[] = new double[n+1];
    double v[] = new double[n+1];
    // Assign time step and initial position and velocity
    double dt = 2*Math.PI/n;
    x[0] = 0;
    v[0] = 1;
    // Calculate other position and velocity recursively
    for (int i=0; i<n; ++i) {
    x[i+1] = x[i]+v[i]*dt;
    v[i+1] = v[i]-x[i]*dt;
    }
    // Output the result in every j time steps
    double t = 0;
    double jdt = j*dt;
    for (int i=0; i<=n; i+=j) {
        System.out.println(t +" " + x[i] + " " + v[i]);
        t += jdt;
    }
    }
}