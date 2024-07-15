/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
         return functions.reduceRight((acc, fn) => {
            const result = fn(acc);
            return result;
        }, x);
      
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */