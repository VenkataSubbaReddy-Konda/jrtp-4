		GIT HUB
----------------------------------------------------------------


	      git add                 git commit	git push
Working tree ---------> Staging area ---------> Local Repo ------> Central Repo
  git init					git log	
  git status    




Git commands:



git init	: To initialize the working tree
			git init

git status	: To check the working tree status(staged + unstaged files)
			git status

git add		: Add files to staging area
			git add <filename>
			git add .   (to add all files in staging area)

git restore	: To unstage the files
			Unstage the file ( when it is added to staging )
			git restore --staged <file name>
			
			discard file changes ( when it is unstaged )
			git restore <file name>
 
git commit	: Send files from staging area to local Repo
			git commit -m <message>

git log		: To check commit history
			git log

git push	: Send files from local repo to central repo