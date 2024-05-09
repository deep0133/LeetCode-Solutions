/**
 * @param {number[]} happiness
 * @param {number} k
 * @return {number}
 */
var maximumHappinessSum = function(happiness, k) {
    let arr = happiness.sort((a,b)=> b-a);
    
    let turn = 0;
    let totalSum = 0;
    
    for(let i=0;i<k;i++){
        totalSum += Math.max(arr[i]-turn,0);
        turn++;
    }
    
    return totalSum;
};