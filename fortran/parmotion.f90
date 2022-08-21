! Motion of particle in 1D under an elastic force f(x) = -x 
program onedmotion
    implicit none 
    integer, parameter :: n = 10001,in=500
    integer :: i 
    real :: pi, dt
    real, dimension (n) :: t,v,x 
    ! assign
    pi   = 4.0*ATAN(1.0); dt   = 2.0*pi/FLOAT(N-1)
    x(1) = 0.0;t(1) = 0.0; v(1) = 1.0
    ! recursion for position and velocity  
    do i = 1 , n-1
        t(i+1) = dt*i 
        x(i+1) = x(i) + v(i)*dt 
        v(i+1) = v(i) - x(i)*dt
    enddo 
    ! print the results:
    WRITE (6,"(3F16.8)") (t(i),x(i),v(i),i=1,n,in)
end program 
