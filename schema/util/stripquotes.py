import sys

with open(sys.argv[1], 'r') as f:
    out = open(sys.argv[2], 'w')
    columns = list(map(int, sys.argv[3].split(',')))
    for l in f.readlines():
        xs = l.strip('\n').split(',')
        for i in columns:
            xs[i] = xs[i].strip("'")
        xs = map(str, xs)
        s = ','.join(xs) + '\n'
        out.write(s)
    out.close()