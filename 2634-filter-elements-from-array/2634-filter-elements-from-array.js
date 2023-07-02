/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let newArr = [];
    arr.forEach((val,index)=>{
        if(fn(val,index)) newArr.push(val);
    })
    return newArr;
};