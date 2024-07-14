function createCounter(n: number): () => number {
    let counter:number = n;
    return function() {
        const myNum = counter
        counter=counter+1;
        return myNum;
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */