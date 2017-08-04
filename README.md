# video-store
Martin Fowler's Video Store Example

### scenario
Main Goal:  
The current implementation only support plain text output (see example in App class).  
Please extend the current functionality by additional format support for HTML.

### use cases
A Customer 
- should be able to rent several movies
- should be able to print a bill
- should be able to earn frequent renter points

### classes
A __Movie__ - has a __title__ and a __price code__  
A __Rental__ - has a __movie__ and __days rented__  
A __Customer__ - has a __name__ and a __list of rentals__ and can get the __bill__ as statement  
