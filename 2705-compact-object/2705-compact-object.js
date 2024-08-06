/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    if(obj === null) return null;
    if(Array.isArray(obj)) return obj.filter(Boolean).map(compactObject)
    if(typeof obj !== 'object' ) return obj;
    
    const map = {}
    
    for(let key in obj){
        let value = compactObject(obj[key]);
        if (Boolean(value)) map[key] = value;
    }
    
    return map;
};
