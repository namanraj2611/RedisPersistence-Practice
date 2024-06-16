### This is a Practice Project created for understanding Spring Boot + Redis = Spring Data Redis, performing Basic CRUD Operations, Provides faster read and writes.



- In this project, I used redis as a Persistent Database.
- Redis can also be used as Cache Memory/In-Memory, for faster read and writes.(Check another Repository, used Redis as CacheMemory also)
- Redis can also be used as Pub/Sub Messageing and Data Replication, in form of Master-Slave Architecture.

![redis](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/ff01e99d-b33b-4834-ace6-2f1dcd488bfd)



### - Cache Hit
A cache hit occurs when the data requested by an application is found in the Redis cache. This means that the data can be retrieved quickly from memory without having to access the slower backend database. Cache hits improve the performance and responsiveness of the application.

**Example Scenario:**

1. The application requests user data with the user ID 123.
2. Redis is queried, and the data for user ID 123 is found in the cache.
3. The data is returned to the application quickly.
   
### - Cache Miss
A cache miss happens when the data requested by an application is not found in the Redis cache. When a cache miss occurs, the application must retrieve the data from the slower backend database or another data source. After fetching the data, it is often stored in the Redis cache for future requests.

**Example Scenario:**

1. The application requests product details with product ID 456.
2. Redis is queried, but the data for product ID 456 is not found in the cache.
3. The application queries the backend database for the product details.
4. The retrieved data is then stored in Redis.
5. The data is returned to the application.

### - How to Handle Cache Hits and Misses

- **Cache Hit Handling:**

If data is found in the Redis cache, simply return the data to the application.
Example Redis command to get data: GET user:123

- **Cache Miss Handling:**

If data is not found in the Redis cache, fetch the data from the backend database.
Store the fetched data in Redis for future use.

**Example-** For a specific userId (ab9ba07a-542d-494d-81f1-b3993fef7010), we will send an initial request and after that we will send one more and see the difference between the response time of consecutive requests.

- First Time Request took **52ms** of response time.

  ![image](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/6baac34a-d976-4b3d-a303-0ac61c16107e)

- Second Time Request took **8ms** of response time. You can see the difference.

  ![image](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/fe735618-1534-4706-8aa2-ff8eb86c97f9)



# **Here are the few Screenshots:** 

**Get a User By User ID**, **Create a new User** and **Delete a User By ID**




- Create an User

![image](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/461b3572-cb26-4b66-9f92-42a69e362435)



- Get an User by userId

![image](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/e406603f-967b-40d9-97ce-ee4a938f0a88)


- Get All Users

![image](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/affa0a8d-8d10-4c21-a586-76d71220eb8b)



- Delete an User by UserId

  ![image](https://github.com/namanraj2611/RedisPersistence-Practice/assets/52111704/0df8bf81-3c16-4143-b9a8-15a8c370a90c)

  


