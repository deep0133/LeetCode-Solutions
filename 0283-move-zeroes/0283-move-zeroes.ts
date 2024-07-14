/**
 Do not return anything, modify nums in-place instead.
 */
function moveZeroes(nums: number[]): void {
    const duplicateArr:number[] = nums.filter((val:number)=>{
        return val !== 0 
    })

console.log(duplicateArr.length)
for(let i = 0;i<duplicateArr.length;i++){
    nums[i] = duplicateArr[i];
}
for(let i = duplicateArr.length;i<nums.length;i++){
    nums[i] = 0
}


};