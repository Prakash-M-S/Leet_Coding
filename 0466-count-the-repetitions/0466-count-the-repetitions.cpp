class Solution {
public:
    int getMaxRepetitions(string s1, int n1, string s2, int n2) {
        int len1=s1.length(),len2=s2.length();

        vector<int> cycst(len1, -1),cyclen(len1, 0),rounds(len1, 0);

        int currst=0,s2idx=0,rnds=0,totRounds=0;

        cycst[0]=0;
        rounds[0]=0;

        for (int i =0; i <len1*n1;i++) {
            if (s1[i % len1]==s2[s2idx]) {
                s2idx++;
            }

            if (s2idx==len2) {
                rnds++;
                cyclen[currst]=i-cycst[currst] + 1;

                if (cycst[(i +1)%len1]==-1) {
                    cycst[(i + 1)%len1]=i + 1;
                    currst=(i+1)%len1;
                    rounds[currst]=rnds;
                } else {
                    currst=(i + 1)%len1;

                    int cycspan=i-cycst[currst]+1;
                    int addncycles =(len1*n1-i-1)/cycspan;
                    int addnrounds=addncycles*(rnds-rounds[currst]);
                    totRounds+=rnds+addnrounds;

                    i +=cycspan*addncycles;
                    i++;
                    while (i<len1*n1) {
                        i +=cyclen[i%len1];
                        if (i <len1*n1) {
                            totRounds++;
                        }
                    }

                    return totRounds/ n2;
                }
                s2idx=0;
            }
        }

        return rnds/n2;
    }
};
