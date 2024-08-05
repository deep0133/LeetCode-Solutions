/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    if(arr.length === 0) return [];
    if(size >= arr.length) return [arr];
   
    
    const res = []
    
    let temp = []
    let j = 0;
    arr.map((val)=>{
        if(j < size){
            temp.push(val);
            j++;
        }
        if(j === size){
            res.push(temp)
            j = 0
            temp = []
        }
        
    })
    
    if(j > 0){
        res.push(temp);
    }
    
    return res;
};
