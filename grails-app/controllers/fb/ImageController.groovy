package fb

class ImageController {

    def showProfilePhoto(Integer id) {
        response.outputStream << User.get(id).photo
    }
}
