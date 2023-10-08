
var TimeLimitedCache = function() {
    this.cache=[];
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const expirationTime = Date.now() + duration;
    
    const existingEntry = this.cache.find((ele) => ele.key === key);

    if (existingEntry) {
        existingEntry.value = value;
        existingEntry.expirationTime = expirationTime;
        return true;
    } else {
        this.cache.push({ key, value, expirationTime });
        return false;
    }
    
};

TimeLimitedCache.prototype.get = function(key) {
    const currentTime = Date.now();
    const entry = this.cache.find((ele) => ele.key === key);

    if (entry && entry.expirationTime >= currentTime) {
        return entry.value;
    }

    return -1;
};

TimeLimitedCache.prototype.count = function() {
    const currentTime = Date.now();
    // Use the filter method to count non-expired keys.
    const nonExpiredEntries = this.cache.filter((ele) => ele.expirationTime >= currentTime);
    return nonExpiredEntries.length;
};

/**
 * const timeLimitedCache = new TimeLimitedCache()
 * timeLimitedCache.set(1, 42, 1000); // false
 * timeLimitedCache.get(1) // 42
 * timeLimitedCache.count() // 1
 */