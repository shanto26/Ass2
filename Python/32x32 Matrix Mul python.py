import numpy as np
from datetime import datetime
start_time = datetime.now()

x = np.random.randint(10, size=(32, 32))
y = np.random.randint(10, size=(32, 32))

r = [[0 for x in range(32)] for y in range(32)]


for i in range(len(x)):
    for j in range(len(y[0])):
        for k in range(len(y)):
 
            r[i][j] += x[i][k] * y[k][j]

print(r) 
end_time = datetime.now()
print('Duration: {}'.format(end_time - start_time))
