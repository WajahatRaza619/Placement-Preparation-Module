void process(string s){
	int n = s.size();
	// memset(cnt, 0, sizeof(cnt));
	for(int i = 0; i<n; ++i)
		++cnt[i][s[i]-'a'];

	for(int i = 1; i<n; ++i)
		for(int j = 0; j<26; ++j)
			cnt[i][j] += cnt[i-1][j];
}
int count(int l, int r, char c){
	return cnt[r][c-'a'] - cnt[l-1][c-'a'];
}
