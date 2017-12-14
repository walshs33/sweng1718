GITHUB_API = 'https://api.github.com'


import requests
import json
from urlparse import urljoin


def main():
    #
    # User Input
    #
    username = raw_input('Github username: ')
    password = raw_input('Github password: ')
    #
    # Compose Request
    #
    url = urljoin(GITHUB_API, 'authorizations')
    payload = {}
    res = requests.post(
        url,
        auth = (username, password),
        data = json.dumps(payload),
        )
    print res.text

if __name__ == '__main__':
    main()
