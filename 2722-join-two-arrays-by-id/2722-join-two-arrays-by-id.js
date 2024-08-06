/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    const hashMap = {};
    
    for(let arrObj of arr1.concat(arr2)){
        const objId = arrObj.id;
        if(hashMap[objId]){
            hashMap[objId] = {...hashMap[objId],...arrObj};
        }else{
            hashMap[objId] = arrObj
        }
    }
    return Object.values(hashMap);
}; 
