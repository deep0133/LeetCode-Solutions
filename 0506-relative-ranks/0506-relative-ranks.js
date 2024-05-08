var findRelativeRanks = function(score) {

    let sortedArr = [...score].sort((a, b) =>b-a);

    let map = {};
    
    for (let i = 0; i < sortedArr.length; i++) {
        map[score[i]] = (i+1).toString();
    }
    
     for (let i = 0; i < sortedArr.length; i++) {
        if (i === 0) {
            map[sortedArr[i]] = "Gold Medal";
        } else if (i === 1) {
            map[sortedArr[i]] = "Silver Medal";
        } else if (i === 2) {
            map[sortedArr[i]] = "Bronze Medal";
        } else {
            map[sortedArr[i]] = (i + 1).toString(); 
        }
    }
    
    
    
    let result = score.map(s => map[s]);
    
    return result;
};
