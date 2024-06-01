/**
 * @param {string} s
 * @return {number}
 */
var scoreOfString = function(s) {
    let sum = 0;
    
    for(let i=1;i<s.length;i++){
        let val_1 = s.charCodeAt(i-1);
        let val_2 = s.charCodeAt(i);

        
        sum += Math.abs(val_1 - val_2);
    }
    return sum;
};