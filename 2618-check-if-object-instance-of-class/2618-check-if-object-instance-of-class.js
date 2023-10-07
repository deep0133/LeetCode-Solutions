/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */
var checkIfInstanceOf = function(obj, classFunction) {
     if(obj == null)return false;                     //if object became null return false
    if(obj.constructor === classFunction)            //if found return true;
    {
        return true;
    }
    obj = Object.getPrototypeOf(obj);
    return checkIfInstanceOf(obj, classFunction);
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */