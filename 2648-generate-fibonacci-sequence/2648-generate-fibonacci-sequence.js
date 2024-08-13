/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let prev = 0;
    let current = 1;
    
    yield 0;
    yield 1;
    
    while(true){
        let temp = current;
        current += prev;
        prev = temp;
        
        yield current;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */