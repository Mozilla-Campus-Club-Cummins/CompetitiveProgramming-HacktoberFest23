#include <iostream>
#include <vector>
#include <queue>
#include <unordered_map>

using namespace std;

const int MOD = 1e9 + 7;

int countWaysToDestination(int n, vector<vector<int>>& roads) 
{
    vector<vector<pair<int, int>> > adj(n);
    
    for (auto road : roads) 
    {
        int u = road[0], v = road[1], t = road[2];
        adj[u].push_back({v, t});
        adj[v].push_back({u, t});
    }
    
    vector<long long> shortestTime(n, LLONG_MAX);
    vector<long long> ways(n, 0);
    
    priority_queue<pair<long long, int>, vector<pair<long long, int>>, greater<pair<long long, int>>> pq;
    pq.push({0, 0});
    shortestTime[0] = 0;
    ways[0] = 1;
    
    while (!pq.empty()) 
    {
        auto [time, current] = pq.top();
        pq.pop();
        
        if (time > shortestTime[current]) 
        {
            continue;
        }
        
        for (auto [neighbor, neighborTime] : adj[current]) 
        {
            if (shortestTime[neighbor] > shortestTime[current] + neighborTime) 
            {
                shortestTime[neighbor] = shortestTime[current] + neighborTime;
                pq.push({shortestTime[neighbor], neighbor});
                ways[neighbor] = ways[current];
            } else if (shortestTime[neighbor] == shortestTime[current] + neighborTime) 
            {
                ways[neighbor] = (ways[neighbor] + ways[current]) % MOD;
            }
        }
    }
    
    return ways[n - 1];
}

int main() 
{
    int n = 7;
    vector<vector<int>> roads = {{0,6,7},{0,1,2},{1,2,3},{1,3,3},{6,3,3},{3,5,1},{6,5,1},{2,5,1},{0,4,5},{4,6,2}};

    int ways = countWaysToDestination(n, roads);
    
    cout << "Number of ways to reach the destination in the shortest time: " << ways << endl;

    return 0;
}
