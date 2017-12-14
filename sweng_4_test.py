from github import Github
import getpass

#user input
username = "walshs33"
pword = getpass.getpass("password: ")

g = Github(username, pword)

print("commits:")
for repo in g.get_user().get_repos():
        print(repo.StatsCommitActivity)

print("no. of private repos:")
print g.get_user().total_private_repos
