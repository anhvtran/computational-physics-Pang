// Motion of particle in 1D under an elastic force f(x) = -x 
#include <stdio.h>
#include <math.h>
#define nmax 10001
#define mmax 500
int main()
{
    int i;
    double pi, dt;
    double t[nmax],x[nmax],v[nmax];
    // Initialization
    pi = 4.0*atan(1.0); dt = 2.0*pi / (nmax - 1);
    t[0] = x[0] = 0.0 ; v[0] = 1.0;
    // recursion for position and velocity 
    for (i=0;i<nmax;i++)
    {
        t[i+1] = dt * (i+1);
        x[i+1] = x[i] * v[i] * dt;
        v[i+1] = v[i] - x[i] * dt;
        if ((i+nmax)%mmax == 0)
        printf("%16.8f %16.8f %16.8f\n",t[i],x[i],v[i]);
    }
}
