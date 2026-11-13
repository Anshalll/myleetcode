class ParkingSystem {
public:
    int a = 0;
    int b = 0; 
    int c = 0; 




    ParkingSystem(int big, int medium, int small) {
        a = big;
        b = medium;
        c = small;

    }
    
    bool addCar(int carType) {
        if(carType == 1 && a > 0) { 
            a = a -1; 
            return true;
        }
       
        else if(carType == 2 && b > 0) { 
            b = b - 1; 
            return true;
        }
       
        else if(carType == 3 && c > 0) { 
            c = c - 1; 
            return true;
        }
        else{ 
            return false; 
        }
    }
};

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem* obj = new ParkingSystem(big, medium, small);
 * bool param_1 = obj->addCar(carType);
 */