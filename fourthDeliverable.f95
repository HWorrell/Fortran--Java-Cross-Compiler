SUBROUTINE incrementOne(byOne)

    IMPLICIT NONE

    INTEGER, INTENT(INOUT) :: byOne

    byOne = byOne + 1

END SUBROUTINE incrementOne


program fourthDeliverable

        implicit none
        
        integer, dimension(5) :: xVar
		
        integer :: yVar, byOne, byTwo

		logical :: isSame
		
        integer :: i
		
		character(len=6) :: string1, string2
		
        print *, "byOne equals ", byOne
		
		print *, "enter an integer to increment by one"

		read *, byOne
		
        CALL incrementOne(byOne)

        print *, "byOne equals ", byOne
		
		print *, "enter a number to increment by two"

        read *, byTwo

        print *, "byTwo equals ", byTwo

        byTwo = incrementTwo(byTwo)

        print *, "byTwo equals ", byTwo

        xVar(1) = 1

        xVar(2) = 2

        xVar(3) = 3

        xVar(4) = 4

        xVar(5) = 5

        i = 1

		print *, "Array X from 1 through 5"
		
        do while(i <= 5 )

        print *, xVar(i)

        i = i + 1

        end do
		
		print *, "Enter a scalar to multiply x by:"
		
		read *, yVar

        call scalarmult(xVar, yVar)

        i = 1

        do while(i <= 5 )

        print *, xVar(i)

        i = i + 1

        end do
		
		print *, "Enter a value to find the absolute value of"
		
		read *, i
		
		i = abs(i)

		print *, i
		
		print *, "enter a string of twenty characters or less"
		
		read *, string1
		
		print *, "enter a second string of twenty characters or less"
		
		read *, string2
		
		isSame = string1 == string2
		
		if (isSame) then
		
		print *, "The strings are identical"
		
		else
		
		print *, "The strings are different"
		
		end if
		
        CONTAINS

            INTEGER FUNCTION incrementTwo(byTwo)

                IMPLICIT NONE

                INTEGER, INTENT(IN) :: byTwo

                incrementTwo = byTwo + 2

                RETURN

            END FUNCTION incrementTwo

end program fourthDeliverable

subroutine scalarmult(xVar, yVar)

        integer, intent(inout) :: xVar(5), yVar

        xVar = xVar * yVar

end subroutine scalarmult
