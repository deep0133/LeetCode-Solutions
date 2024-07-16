/**
 * @param {number} millis
 * @return {Promise}
 */
async function sleep(millis) {
    const t = Date.now()
    let time = 0;
   return new Promise((res,rej)=>{
        setTimeout(()=>{
        res(1)
    },millis)
   })
    
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
 */