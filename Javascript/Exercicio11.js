const LinksSocialMedia = {
  github: 'HenriqueGMen',
  facebook: 'henrique.mendonca.18',
  instagram: 'henrique.mendonnca',
  twitter: 'henriquegmen'
}

function getSocialMediaInfo() {
    for (let link in LinksSocialMedia) {
    console.log(`${link} - ${LinksSocialMedia[link]}`)
  }
}

getSocialMediaInfo()


const socialMedia = ["github", "facebook", "instagram", "twitter"]

function getSocialMedia() {
  for(let media of socialMedia) {
    console.log(media)
  }
}

getSocialMedia()